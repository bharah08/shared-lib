def function () {
  sh 'docker build -t $appRegistry:$tagname .
}
