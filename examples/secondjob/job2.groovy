job('example2') {
    steps {
        shell('echo START')
        gradle('check')
    }
}
