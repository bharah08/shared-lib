def call () {
  sh 'docker build -t $appRegistry:$tagname .'
}
