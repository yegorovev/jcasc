multibranchPipelineJob('DevOpsSchool/pipeline-multibranch') {
    branchSources {
        factory {
            workflowBranchProjectFactory {
                scriptPath('jenkins-multibranch/Jenkinsfile.groovy')
            }
        }
        github {
            id('123456') // IMPORTANT: use a constant and unique identifier
            repoOwner('yegorovev')
            repository('draft')
            excludes('main')
            buildOriginPRHead(true)
            buildForkPRHead(false)
            buildForkPRMerge(false)
        }
    }
}