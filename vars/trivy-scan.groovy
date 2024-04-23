def call () {
  sh 'trivy image $appRegistry:$tagname > scan.txt'
}
