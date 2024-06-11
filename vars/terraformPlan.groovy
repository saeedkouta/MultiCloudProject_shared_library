def call(String planFile = 'tfplan') {
    sh "terraform plan -out=${planFile}"
}
