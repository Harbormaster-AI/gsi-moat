#header()
#set( $className = ${classObject.getName()} )
#set( $lowercaseClassName = ${Utils.lowercaseFirstLetter( ${className} )} )
package ${aib.getRootPackageName(true)}.#getRestControllerPackageName().command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

#set( $imports = [ "api", "delegate", "entity", "exception", "projector" ] )
#importStatements( $imports )

import ${aib.getRootPackageName(true)}.#getRestControllerPackageName().*;

/**
 * <h2>${className}CommandRestController as REST API</h2>
 * <p>
 * Implements Spring Controller command CQRS processing for entity ${className}.
 * </p>
 #generatedFrom()
 *
 * <h3>Services Used</h3>
 *
 *  	${className}Service
 *
 * <h3>Produces</h3>
 *
 *      <p>application/json</p>
 *
 * <h3>Commands Accepted</h3>
 *      <ul>
 *      <li>${classObject.getCreateCommandAlias()}</li>
 *      <li>${classObject.getUpdateCommandAlias()}</li>
 *      <li${classObject.getDeleteCommandAlias()}</li>
 *      </ul>
 *
 * <p>@author $aib.getAuthor()</p>
 */

@CrossOrigin
@RestController
@RequestMapping("/${className}Command")
##if ( $classObject.hasParent() == true )
##	#set( $parentController = "${classObject.getParentName()}CommandRestController" )
##	#set( $parentName = $classObject.getParentName() )
##else
	#set( $parentController = "BaseSpringRestController" )
##end
public class ${className}CommandRestController extends $parentController {

	public ${className}CommandRestController( ${className}Service service ) {
		this.service = service;
	}
	
    /**
     * Handles create a ${className}.
     * @param		${className}	${lowercaseClassName}
     * @return		CompletableFuture<UUID> 
     */
	@PostMapping("/create")
    public CompletableFuture<UUID> create( @RequestBody(required=true) ${classObject.getCreateCommandAlias()} command ) {
		CompletableFuture<UUID> completableFuture = null;
		try {

			completableFuture = service.create${className}( command );
        }
        catch( Throwable exc ) {
        	LOGGER.log( Level.WARNING, exc.getMessage(), exc );        	
        }
		
		return completableFuture;
    }

    /**
     * Handles updating a ${className}.  if no key provided, calls create, otherwise calls save
     * @param		${className} $lowercaseClassName
     * @return		CompletableFuture<Void>
     */
	@PutMapping("/update")
    public CompletableFuture<Void> update( @RequestBody(required=true) ${classObject.getUpdateCommandAlias()} command ) {
		CompletableFuture<Void> completableFuture = null;
		try {                        	        
			// -----------------------------------------------
			// delegate the ${classObject.getUpdateCommandAlias()}
			// -----------------------------------------------
			completableFuture = service.update${className}(command);;
	    }
	    catch( Throwable exc ) {
	    	LOGGER.log( Level.WARNING, "${className}Controller:update() - successfully update ${className} - " + exc.getMessage());        	
	    }		
		
		return completableFuture;
	}
 
    /**
     * Handles deleting a ${className} entity
     * @param		command ${class.getDeleteCommandAlias()}
     * @return		CompletableFuture<Void>
     */
    @DeleteMapping("/delete")    
    public CompletableFuture<Void> delete( @RequestParam(required=true) UUID ${lowercaseClassName}Id  ) {
    	CompletableFuture<Void> completableFuture = null;
		${classObject.getDeleteCommandAlias()} command = new ${classObject.getDeleteCommandAlias()}( ${lowercaseClassName}Id );

    	try {
        	${className}Service delegate = service;

        	completableFuture = delegate.delete( command );
    		LOGGER.log( Level.WARNING, "Successfully deleted ${className} with key " + command.get${className}Id() );
        }
        catch( Throwable exc ) {
        	LOGGER.log( Level.WARNING, exc.getMessage() );
        }
        
        return completableFuture;
	}        
	

#set( $includeComposites = false )
#foreach( $singleAssociation in $classObject.getSingleAssociations( ${includeComposites} ) )
#set( $roleName = $singleAssociation.getRoleName() )
#set( $childType = $singleAssociation.getType() )
#set( $alias = ${singleAssociation.getAssignToCommandAlias()} )
    /**
     * save ${roleName} on ${className}
     * @param		command $alias
     */     
	@PutMapping("/assign${roleName}")
	public void assign${roleName}( @RequestBody ${alias} command ) {
		try {
			service.assign${roleName}( command );   
		}
        catch( Throwable exc ) {
        	LOGGER.log( Level.WARNING, "Failed to assign ${roleName}", exc );
        }
	}

#set( $alias = ${singleAssociation.getUnAssignFromCommandAlias()} )	
    /**
     * unassign ${roleName} on ${className}
     * @param		 command ${alias}
     */     
	@PutMapping("/unAssign${roleName}")
	public void unAssign${roleName}( @RequestBody(required=true)  ${alias} command ) {
		try {
			service.unAssign${roleName}( command );   
		}
		catch( Exception exc ) {
			LOGGER.log( Level.WARNING, "Failed to unassign ${roleName}", exc );
		}
	}
	
#end

#foreach( $multiAssociation in $classObject.getMultipleAssociations() )
#set( $roleName = $multiAssociation.getRoleName() )
#set( $childType = $multiAssociation.getType() )
#set( $alias = ${multiAssociation.getAddToCommandAlias()} )
    /**
     * save ${roleName} on ${className}
     * @param		command ${alias}
     */     
	@PutMapping("/addTo${roleName}")
	public void addTo${roleName}( @RequestBody(required=true) ${alias} command ) {
		try {
			service.addTo${roleName}( command );   
		}
		catch( Exception exc ) {
			LOGGER.log( Level.WARNING, "Failed to add to Set $roleName", exc );
		}
	}

#set( $alias = ${multiAssociation.getRemoveFromCommandAlias()} )	
    /**
     * remove ${roleName} on ${className}
     * @param		command ${alias}
     */     	
	@PutMapping("/removeFrom${roleName}")
	public void removeFrom${roleName}( 	@RequestBody(required=true) ${alias} command )
	{		
		try {
			service.removeFrom${roleName}( command );
		}
		catch( Exception exc ) {
			LOGGER.log( Level.WARNING, "Failed to remove from Set ${roleName}", exc );
		}
	}

#end

//************************************************************************    
// Attributes
//************************************************************************
    protected ${className} $lowercaseClassName = null;
	protected ${className}Service service = null;
    private static final Logger LOGGER = Logger.getLogger(${className}CommandRestController.class.getName());
    
}
