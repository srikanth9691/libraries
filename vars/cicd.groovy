def newGit(repo)
{
  git "https://github.com/srikanth9691/${repo}.git"
}
def newMaven()
{
  sh "mvn package"
}

