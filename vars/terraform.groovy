#!usr/bin/env groovy
def call() {
       sh 'terraform init'
       sh 'terraform validate'
       sh 'terraform plan'
       sh 'terraform apply -auto-approve'
   }
