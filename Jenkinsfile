pipeline {
    agent any

    environment{
        new_version = '1.0.3'
    }
    parameters {
        
        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

    }

    stages {
        stage('build') {
            when{
                expression{
                    params.TOGGLE
                }
            }
            steps {
                echo 'parameter'
                echo "env varible ${new_version}"
            }
        }
        stage('test')
        {
            steps {
                echo 'test phase '
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy '
            }
        }
    }
    post {
        always {
            echo 'post script always executed irrespective of build status'
        }
    }
}
