def call() {
  dependencyCheck(
    additionalArguments: '--scan ./ --format XML --out dependency-check-report',
    odcInstallation: 'OWASP'
  )

  dependencyCheckPublisher(
    pattern: 'dependency-check-report/dependency-check-report.xml'
  )
}
