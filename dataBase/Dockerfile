FROM ubuntu
WORKDIR /app
RUN apt-get update -y
RUN apt-get upgrade -y
RUN sudo apt install mysql-client-core-5.7 -y
COPY . /src
COPY . /target