# ats-common
# install maven 3.8.1
>download apache-maven-3.8.1-bin.tar.gz

$ mkdir /usr/local/maven

$ tar xzf apache-maven-3.8.1-bin.tar.gz -C /usr/local/maven/ --strip-components=1

$ echo export 'PATH=:wq!/usr/local/maven/bin:$PATH' > /etc/profile.d/maven.sh
$ echo 'export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-17.0.3.0.7-2.el8_6.x86_64' >> /etc/profile.d/maven.sh

$ chmod +x /etc/profile.d/maven.sh

$ source /etc/profile.d/maven.sh

$ mvn --version
