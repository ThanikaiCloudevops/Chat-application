Library ("my_shared_library")
// Sportsdata Production Jenkins shared library 
pipeline {
    agent {
        label "node-1"
    }
    //  Environment For Project specific Urls 
    environment{
        giturl = "https://SciflareIT@bitbucket.org/fantasysportpro/fantasypro_sportsdata.git"
        gitbranch = "master"
    }
    stages{
        stage("Checkout SCM"){
            steps{
                script{
                    echo "****************  Sportsdata Production ****************"
                    echo "giturl =${giturl}"
                    echo "gitbranch = ${gitbranch}"
                }
            }
        }
        stage("Docker compose checking"){
            steps{
                script{
                    echo "Docker compose checking"
                }
            }
        }
    }
}