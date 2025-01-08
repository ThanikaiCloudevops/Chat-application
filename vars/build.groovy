// vars/build.groovy
// Environment variables
def call(String imageName,String imageTag) {
    // Step 1: Check Docker version
    echo "Checking Docker version..."
    sh "docker --version"
    // Step 2: Build Docker image
    echo "Pulling Docker image ${imageName}:${imageTag}..."
    sh """
        docker pull ${imageName}:${imageTag}
    """ 
    sh """
        docker run --rm ${imageName}:${imageTag}
    """
    // echo "Building Docker image ${imageName}:${imageTag} from Dockerfile at ${dockerfilePath}..."
    // sh """
    //     docker build -t ${imageName}:${imageTag} -f ${dockerfilePath} .
    // """
}
