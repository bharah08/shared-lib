def call(){
withSonarQubeEnv('sonar'){
                   sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=bookstore \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=bookstore'''
               }
}
