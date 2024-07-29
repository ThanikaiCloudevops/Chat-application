FROM node:18

WORKDIR /usr/src/app

COPY client/package*.json ./

RUN npm install

COPY client/ .

EXPOSE 3000

CMD [ "node", "src/app.js" ]
