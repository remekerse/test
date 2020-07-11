FROM centos 
RUN cd /tmp && \
yum -y install wget && \
wget https://sourceforge.net/projects/openofficeorg.mirror/files/4.1.6/binaries/zh-CN/Apache_OpenOffice_4.1.6_Linux_x86-64_install-rpm_zh-CN.tar.gz && \
tar -xvf Apache_OpenOffice*.tar.gz && \
yum install -y zh-CN/RPMS/*.rpm && \
yum install -y java-1.8.0-openjdk.x86_64 && \
yum clean all && \
rm -f Apache_OpenOffice_4.1.6_Linux_x86-64_install-rpm_zh-CN.tar.gz&& \
rm -Rf zh-CN
EXPOSE 8100
CMD /opt/openoffice4/program/soffice -headless -nofirststartwizard  -accept="socket,host=0.0.0.0,port=8100;urp;"