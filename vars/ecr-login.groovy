def function(){
  sh 'aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 211125513262.dkr.ecr.ap-south-1.amazonaws.com'
}
