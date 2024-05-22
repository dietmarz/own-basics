describe('First-App', function () {
    beforeEach(function () {
    });
    test('try something', function () {
        expect(1 + 2).toBe(3);
    });
    test('try boolean', function () {
        function checkBoolean(variable) {
            return typeof variable === 'boolean';
        }
        var isBoolean = true;
        expect(checkBoolean(isBoolean)).toBe(true);
    });
});
