def call(){

       sparkSend credentialsId: '15e9eb64-1714-4a78-a9cb-674cfe3c6202', 
       message: "${JOB_NAME}${JOB_URL} ${currentBuild.currentResult}", messageType: 'text', spaceList: [[spaceId: '7f719b30-860d-11ea-9583-c154a39de77b']]
}

def call(String filter_string){
       
        

       sparkSend credentialsId: '15e9eb64-1714-4a78-a9cb-674cfe3c6202', 
       message: "${JOB_NAME}${JOB_URL} <h3>${currentBuild.currentResult}</h3>",messageType: 'html', spaceList: [[spaceId: '7f719b30-860d-11ea-9583-c154a39de77b']]
}

