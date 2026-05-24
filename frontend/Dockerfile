# Stage 1 - Build Angular App

FROM node:20 AS build

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build --output-path=./dist/frontend/browser

# Stage 2 - Serve using Nginx

FROM nginx:alpine

COPY --from=build app/dist/frontend/browser /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]