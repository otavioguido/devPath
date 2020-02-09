Build jar docker image:
'''
docker build -t chat-data-base .
'''

Pull mysql image and start mysql container
'''
docker pull mysql
docker run -p 3306:3306 --name mysql-chat -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=chat_db -e MYSQL_USER=devpath -e MYSQL_PASSWORD=password -d mysql
docker container logs mysql-chat
'''

start application container
'''
docker run -d -p 8089:8089 --name chat-data-base --link mysql-chat:mysql chat-data-base
docker container logs chat-data-base
'''

Application manual:

default path:
http://localhost:8089

- User

create:
/createUser
header: application/json
body:
{
	"login":"manualTestUser",
	"password":"password",
	"name":"manualTestUser"
}

view all:
/viewAllUsers

search by id:
/searchUser/{id}

- Message

save:
/saveMessage

get from chat:
/getMessages

get all:
/getAllMessages

- IM

create:
/createIM

get from user:
/getIms

get all:
/getAllIms

- Group

create:
/createGroup

get from user:
/getGroups

get all:
/getAllGroups