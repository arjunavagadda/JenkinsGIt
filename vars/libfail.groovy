
def call(){

    sparkSend credentialsId: '15e9eb64-1714-4a78-a9cb-674cfe3c6202', 
    message: "${JOB_NAME}${JOB_URL} <h1>${currentBuild.currentResult}</h1> at ${env.STAGE_NAME}", messageType: 'html', spaceList: [[spaceId: '7f719b30-860d-11ea-9583-c154a39de77b']]

}
