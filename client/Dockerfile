FROM node:14

WORKDIR /app/client

COPY client/package.json ./

RUN npm install 

COPY ./ ./

EXPOSE 3000

CMD ['npm' ,'start']