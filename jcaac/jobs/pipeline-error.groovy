pipelineJob("DevOpsSchool/pipeline-error") {
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
    parallel ()
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
