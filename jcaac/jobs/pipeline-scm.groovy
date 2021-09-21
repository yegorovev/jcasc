pipelineJob("DevOpsSchool/pipeline-scm") {
    description()
    keepDependencies(false)
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github("yegorovev/draft", "https")
                    }
                    branch("main")
                }
            }
            scriptPath("jenkins-scm-pipeline/Jenkinsfile.groovy")
        }
    }
    disabled(false)
}
