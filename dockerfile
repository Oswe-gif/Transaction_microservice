FROM openjdk

WORKDIR /parcial2-arquitectura
COPY src .

CMD apachectl -D FOREGROUND