job('example3') {
    steps {
        shell('echo START')
        gradle('check')
    }
}
