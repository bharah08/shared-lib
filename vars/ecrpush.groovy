def call () {
  sh 'docker push $appRegistry:$tagname'
}
