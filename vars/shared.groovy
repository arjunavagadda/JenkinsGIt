def call(String buildStatus = "STARTED"){
     
    getResult()
         

}

def getResult() {
  switch(currentBuild.result) {
    case 'FAILURE':
         echo 'fail'
    
    case 'SUCCESS':
       echo 'success'
       sparkSend credentialsId: '15e9eb64-1714-4a78-a9cb-674cfe3c6202', 
       message: "${JOB_NAME}${JOB_URL} ${currentBuild.currentResult} at ${env.STAGE_NAME}", messageType: 'text', spaceList: [[spaceId: '7f719b30-860d-11ea-9583-c154a39de77b']]
    
    
    default:
      return 'unknown'
  }
}