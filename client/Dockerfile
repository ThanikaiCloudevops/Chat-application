FROM node:18

WORKDIR /usr/src/app

COPY ./ ./

RUN npm install

COPY . .

EXPOSE 3000

CMD [ "node", "src/app.js" ]
