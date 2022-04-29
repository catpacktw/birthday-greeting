## Before executing. create a database and initialize data below:

    use userInfo
    db.userInfo.insertMany([
    { firstName: 'Robert', lastName: 'Yen', gender: 1, birthday: new Date('1985-08-08'), email: 'robert.yen@linecorp.com'},
    { firstName: 'Cid', lastName: 'Change', gender: 1, birthday: new Date('1990-10-10'), email: 'cid.change@linecorp.com'},
    { firstName: 'Miki', lastName: 'Lai', gender: 2, birthday: new Date('1993-04-05'), email: 'miki.lai@linecorp.com'},
    { firstName: 'Sherry', lastName: 'Chen', gender: 2, birthday: new Date('1993-08-08'), email: 'sherry.lai@linecorp.com'},
    { firstName: 'Peter', lastName: 'Wang', gender: 1, birthday: new Date('1950-12-22'), email: 'peter.wang@linecorp.com'}
    ])