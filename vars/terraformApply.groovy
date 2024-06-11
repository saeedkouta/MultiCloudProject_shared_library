def call(String planFile = 'tfplan') {
    sh "terraform apply ${planFile}"
}
