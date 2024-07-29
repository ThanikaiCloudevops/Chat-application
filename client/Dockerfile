FROM node:18 as builder

WORKDIR /usr/src/app

COPY client/package*.json ./

RUN npm install

COPY client/ .

RUN npm run build

FROM node:18-slim

WORKDIR /usr/src/app

COPY --from=builder /usr/src/app/dist /usr/src/app/dist
COPY --from=builder /usr/src/app/package*.json ./

EXPOSE 3000

CMD ['npm','start']
