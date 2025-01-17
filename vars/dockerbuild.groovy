// vars/build.groovy
// Environment variables
def buildimage(String imageName,String imageTag,String dockerfilepath, String dockerimagename="gooplusapi",String aws_repoName,
String ecr_repo_name) {
    // Step 1: Check Docker version
    echo "Checking Docker version..."
    sh "docker --version"

    
    def tag = env.BUILD_ID
    // Step 2: Build Docker image
    echo "Pulling Docker image ${imageName}:${imageTag}..."
    sh """
        docker build -t  ${imageName}:${imageTag} -f ${dockerfilepath} .
    """ 
    // Creating Aws Ecr repo using ansible files
    // echo "Creating Aws ecr repo for ${aws_repoName}"
    // sh """
    //     ansible-playbook  -i playbook/inventory.ini  playbook/ecr_create.yml 
    // """
    // --extra-vars "ecr_repo_name=${aws_repoName}"
}


