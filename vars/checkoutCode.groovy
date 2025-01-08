def call(String repourl,String branch,String credentialsId) {
    // Fetch the Git configuration based on the project
    // def gitbranch = env.GIT_BRANCH ?: ""
    // def repourl = env.REPO_URL ?: ""
    // def credentialsId = env.credentialsId ?: "BitbucketRepo"
    echo "Checking out from repo: ${repourl}, branch: ${branch} with credentials: ${credentialsId}"
    checkout([
        $class: "GitSCM",
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[
            url: repourl,
            credentialsId: credentialsId
        ]]
    ])
}


