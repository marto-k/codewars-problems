/*We have a broken message machine that introduces noise to our incoming messages. We know that our messages are written using a-zA-Z and white characters (like spaces or tabs). Unfortunately our machine introduces noise, which means that our message arrives with characters like: %$&/#·@|º\ª within our original message.

Your mission is to write a function which removes this noise from the message. */


solution:

function removeNoise(str){
  return str.replace(/[\%\$\&\/\#\·\@\|\º\\\ª]/ig, '')
}
