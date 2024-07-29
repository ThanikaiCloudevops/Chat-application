FROM node:14

WORKDIR /app/client

COPY client/ ./

RUN npm install 

COPY client/ ./

EXPOSE 3000

CMD ['npm' ,'start']