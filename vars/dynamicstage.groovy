
def call(){

Deploy_step_1 = [
    "ccsitprimarypre": {
        somefunc()
    },
    "ccsitsecondary1pre": {
        somefunc2()
    }
]

print Deploy_step_1.ccsitprimarypre


}

def somefunc() {
    echo 'echo1'
}

def somefunc2() {
    echo 'echo2'
}

call()

