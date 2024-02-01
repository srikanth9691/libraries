def newGit(repo)
{
  git "https://github.com/srikanth9691/${repo}.git"
}
def newMaven()
{
  sh "mvn package"
}
def newDeploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
def runSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
  
