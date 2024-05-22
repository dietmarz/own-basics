describe('First-App', () => {

    beforeEach(() => {
    });

    test('try something', () => {
        expect(1 + 2).toBe(3);
    });

    test('try boolean', () => {
        function checkBoolean(variable: any): boolean {
            return typeof variable === 'boolean';
        }
        let isBoolean = true
        expect(checkBoolean(isBoolean)).toBe(true);
    });



    test('try types', () => {
        let user: {name : String; age: number, smoker: boolean}; // Type definition
        user = {name: "Max", age: 24, smoker: false}
        class User {name : String; age: number} // Type definition
        let user2 : User = user;

        let hobbies: Array<string>;
        let hoobies2: string[]
        hobbies= ['sport', 'cooking']
        hobbies=hoobies2

        // method should return void instead of undefined


        type CalcFn = (a: number, b:number) => number;  // Type alias
        function calculate(a:number, b:number, calcFn:CalcFn):number {
            return calcFn(a, b);
        }

    });


});
