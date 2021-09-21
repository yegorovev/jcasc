FROM jenkins/jenkins:lts-jdk11
USER root
RUN groupadd -g 992 docker; usermod -a -G docker jenkins
USER jenkins
# Install plugins
COPY --chown=jenkins:jenkins plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

# Install config
COPY --chown=jenkins:jenkins jcaac /var/jenkins_home/jcaac

# Set env vars.
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
ENV CASC_JENKINS_CONFIG="/var/jenkins_home/jcaac/jcaac.yaml"
ENV JENKINS_ADMIN_PASSWORD="admin"