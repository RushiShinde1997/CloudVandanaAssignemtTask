function reveseWords(sentence) {
    // spliting sentence into words i.e. array
    const words = sentence.split(' ');

    //Reversing word using loop

    for(let i = 0; i < words.length; i++) {

        words[i] = words[i].split('').reverse().join('');

    }

    //joining the words 
    const reversedSentence = words.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sunny day";

const reversedSentence = reveseWords(inputSentence);

console.log(reversedSentence);