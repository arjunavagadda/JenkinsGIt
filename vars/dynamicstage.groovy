def somefunc() {
    echo 'echo1'
}

def somefunc2() {
    echo 'echo2'
}

Deploy_step_1 = [
    "ccsitprimarypre": {
        somefunc()
    },
    "ccsitsecondary1pre": {
        somefunc2()
    }
]
