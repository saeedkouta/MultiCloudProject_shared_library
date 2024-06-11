#!usr/bin/env groovy
def call() {
    terraformInit()
    terraformPlan()
    terraformApply()
}
