def function () {
  sh 'trivy image $appRegistry:$tagname > scan.txt'
}
