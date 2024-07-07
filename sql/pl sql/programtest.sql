CREATE TABLE user_values (value NUMBER);

DECLARE
    n NUMBER := 5; -- Number of values to accept
    v_input NUMBER; -- Temporary variable to store user input
BEGIN
    -- Loop to accept 'n' values
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT('Enter value ' || i || ': ');
        v_input := TO_NUMBER(&v_input); -- Accept value from the user
        INSERT INTO user_values VALUES (v_input); -- Insert the value into the table
    END LOOP;

    -- Display the inserted values
    FOR rec IN (SELECT * FROM user_values) LOOP
        DBMS_OUTPUT.PUT_LINE('Inserted value: ' || rec.value);
    END LOOP;
END;
/

