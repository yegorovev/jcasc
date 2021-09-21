pipelineJob("DevOpsSchool/pipeline-01") {
    description()
    keepDependencies(false)
    definition {
        cps {
        sandbox (true)
        script(
"""pipeline {
    agent any

    options {
        timestamps()
    }
    stages {
        stage('First stage') {
            steps {
                sh 'echo This is bash'
            }
        }
     }
}""")
        }
    }
    disabled(false)
}