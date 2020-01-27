FROM ubuntu
WORKDIR /app
RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install openjdk-8-jre -y
COPY . /src
COPY . /target