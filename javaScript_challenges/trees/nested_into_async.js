import superagent from 'superagent';

function getStuff() {
  return superagent.get('http://www.stuff.com');
}

getStuff()
  .then(results => {
    return superagent.get(results.body.url).then(actualStuff => actualStuff);
  })
  .catch('whooops');

async function getStuffBetter() {
  try {
    const stuff = await superagent.get('....');
    const otherStuff = await superagent.get(stuff.body.url);
    console.log(otherStuff);
  } catch (e) {
    console.error(e);
  }
}

getStuffBetter();
