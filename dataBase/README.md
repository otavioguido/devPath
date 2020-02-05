Build jar docker image:
'''
docker build -t chat-data-base .
'''

Pull mysql image and start mysql container
'''
docker pull mysql
docker run --name mysql-chat -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=chat_db -e MYSQL_USER=devpath -e MYSQL_PASSWORD=password -d mysql
docker container logs mysql-chat
'''

start application container
'''
docker run -d -p 8089:8089 --name chat-data-base --link mysql-chat:mysql chat-data-base
docker container logs chat-data-base
'''


