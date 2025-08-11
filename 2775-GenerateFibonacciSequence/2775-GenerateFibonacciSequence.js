// Last updated: 8/12/2025, 12:40:19 AM
/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let current=0;
    let next=1;

    while(true) {
        yield current;
        [current,next]=[next,current+next];
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */