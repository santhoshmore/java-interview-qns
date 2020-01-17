package volvo;

public class ProjectDeployment {
	/*
	//@@@ Experience in deploying application. @@@/// 
	 1. First we develop in local n do testing after that code review by TL/TechnicalManager/peers
	 2. Need to make changes based on feedback.
	 3. Again we have to show for code review, after approval push code to Dev environment
	 4. Deploying the code in Dev
	    # through git we push the code to Dev env
	    # commandds --> git status --> git add . or git add (one by one)
	                --> git pull (if conflicts comes resolve it)--> git commit --> git push
	                
	 5. through jenkins we deploy the project in the server (in my project gulp & tomcat are servers)
	    # give the build in jenkins
	    # after build successful ask for testing, mine is internal project so QA we only within team is used to do testing
	    # if Bugs occurred need to fix those.
	    # after successful testing need to move to Staging for UAT.
	 6. In Staging environment
	    # enable authentication, ask client to do testing 
	    # if bug occurs fix it, from local -> Dev -> Staging push the code
	    # again do testing
	 7. ask client to send teaser to users with various implementations/enhancements/developments
	 8. Production
	    # move the code from Staging to Production
	    # create tag, commit & push the code in production
	    # if any DB scripts need to run, run those scripts
	    # ask admin to give production jeninks build
	      # admin takes the backUp then he will do deployement
	                
	 */
}
